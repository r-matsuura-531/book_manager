USE bookmanager_r_mock;

SET SESSION sql_mode = '';

SET NAMES utf8mb4;
SET CHARACTER SET utf8mb4;
SET collation_connection = 'utf8mb4_0900_ai_ci';

ALTER DATABASE bookmanager_r_mock CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;

-- users テーブルの作成
CREATE TABLE IF NOT EXISTS `users` (
  `id` varchar(100) NOT NULL COMMENT 'ID',
  `last_name` varchar(50) NOT NULL COMMENT '姓',
  `first_name` varchar(50) NOT NULL COMMENT '名',
  `email` varchar(50) NOT NULL COMMENT 'メールアドレス',
  `password` varchar(100) NOT NULL COMMENT 'パスワード (ハッシュ化)',
  `role` int NOT NULL COMMENT 'ロール',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日時',
  `created_by` varchar(100) NOT NULL COMMENT '作成者ID',
  `updated_at` timestamp COMMENT '更新日時',
  `updated_by` varchar(100) COMMENT '更新者ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='ユーザー';

-- 初期データの挿入（管理者、編集者、一般ユーザー）
INSERT INTO `users` (`id`, `last_name`, `first_name`, `email`, `password`, `role`, `created_at`, `created_by`, `updated_at`, `updated_by`)
SELECT * FROM (
    SELECT UUID() AS `id`, 'Admin' AS `last_name`, 'User' AS `first_name`, 'admin@example.com' AS `email`,
          '$2a$10$Ur5fDTP4kzh8kDhSzIRXTu93FS3y9qOiu8SNZNnqLj2yQIow2Kvoi' AS `password`,
          0 AS `role`, NOW() AS `created_at`, 'system' AS `created_by`, NOW() AS `updated_at`, 'system' AS `updated_by`
) AS tmp
WHERE NOT EXISTS (SELECT 1 FROM `users` WHERE `email` = 'admin@example.com');

INSERT INTO `users` (`id`, `last_name`, `first_name`, `email`, `password`, `role`, `created_at`, `created_by`, `updated_at`, `updated_by`)
SELECT * FROM (
    SELECT UUID() AS `id`, 'General' AS `last_name`, 'User' AS `first_name`, 'user@example.com' AS `email`,
          '$2a$10$DN2S0yy79lq/s3vcsRX2CucUpXLIJaR0ZQegq8uGKrhDSDcvputF6' AS `password`,
          1 AS `role`, NOW() AS `created_at`, 'system' AS `created_by`, NOW() AS `updated_at`, 'system' AS `updated_by`
) AS tmp WHERE NOT EXISTS (SELECT 1 FROM `users` WHERE `email` = 'user@example.com');

-- genres テーブルの作成
CREATE TABLE IF NOT EXISTS `genres` (
  `id` varchar(100) NOT NULL COMMENT 'ID',
  `name` varchar(50) NOT NULL COMMENT 'ジャンル名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='ジャンル';

-- 初期データの挿入（すでにデータが存在する場合は挿入しない）
INSERT INTO `genres` (`id`, `name`)
SELECT * FROM (SELECT UUID() AS `id`, 'Fiction' AS `name`) AS tmp
WHERE NOT EXISTS (SELECT 1 FROM `genres` WHERE `name` = 'Fiction');

INSERT INTO `genres` (`id`, `name`)
SELECT * FROM (SELECT UUID() AS `id`, 'Non-Fiction' AS `name`) AS tmp
WHERE NOT EXISTS (SELECT 1 FROM `genres` WHERE `name` = 'Non-Fiction');

INSERT INTO `genres` (`id`, `name`)
SELECT * FROM (SELECT UUID() AS `id`, 'Science' AS `name`) AS tmp
WHERE NOT EXISTS (SELECT 1 FROM `genres` WHERE `name` = 'Science');

-- publishers テーブルの作成
CREATE TABLE IF NOT EXISTS `publishers` (
  `id` varchar(100) NOT NULL COMMENT 'ID',
  `name` text NOT NULL COMMENT '出版社名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='出版社';

-- 初期データの挿入
INSERT INTO `publishers` (`id`, `name`)
SELECT * FROM (SELECT UUID() AS `id`, 'Publisher A' AS `name`) AS tmp
WHERE NOT EXISTS (SELECT 1 FROM `publishers` WHERE `name` = 'Publisher A');

INSERT INTO `publishers` (`id`, `name`)
SELECT * FROM (SELECT UUID() AS `id`, 'Publisher B' AS `name`) AS tmp
WHERE NOT EXISTS (SELECT 1 FROM `publishers` WHERE `name` = 'Publisher B');

INSERT INTO `publishers` (`id`, `name`)
SELECT * FROM (SELECT UUID() AS `id`, 'Publisher C' AS `name`) AS tmp
WHERE NOT EXISTS (SELECT 1 FROM `publishers` WHERE `name` = 'Publisher C');

-- authors テーブルの作成
CREATE TABLE IF NOT EXISTS `authors` (
  `id` varchar(100) NOT NULL COMMENT 'ID',
  `name` text NOT NULL COMMENT '著者名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='著者';

-- 初期データの挿入
INSERT INTO `authors` (`id`, `name`)
SELECT * FROM (SELECT UUID() AS `id`, 'Author X' AS `name`) AS tmp
WHERE NOT EXISTS (SELECT 1 FROM `authors` WHERE `name` = 'Author X');

INSERT INTO `authors` (`id`, `name`)
SELECT * FROM (SELECT UUID() AS `id`, 'Author Y' AS `name`) AS tmp
WHERE NOT EXISTS (SELECT 1 FROM `authors` WHERE `name` = 'Author Y');

INSERT INTO `authors` (`id`, `name`)
SELECT * FROM (SELECT UUID() AS `id`, 'Author Z' AS `name`) AS tmp
WHERE NOT EXISTS (SELECT 1 FROM `authors` WHERE `name` = 'Author Z');

-- books テーブルの作成
CREATE TABLE IF NOT EXISTS `books` (
  `id` varchar(100) NOT NULL COMMENT 'ID',
  `isbn` varchar(13) NOT NULL COMMENT 'ISBN',
  `title` varchar(255) NOT NULL COMMENT 'タイトル',
  `author_id` varchar(100) NOT NULL COMMENT '著書ID',
  `publisher_id` varchar(100) NOT NULL COMMENT '出版社ID',
  `genre_id` varchar(100) NOT NULL COMMENT 'ジャンルID',
  `stock` int NOT NULL COMMENT '在庫数',
  `publication_date` date DEFAULT NULL COMMENT '出版日',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日時',
  `created_by` varchar(100) NOT NULL COMMENT '作成者ID',
  `updated_at` timestamp COMMENT '更新日時',
  `updated_by` varchar(100) COMMENT '更新者ID',
  `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '削除フラグ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='書籍';

-- 初期データの挿入
INSERT INTO `books` (`id`, `isbn`, `title`, `author_id`, `publisher_id`, `genre_id`, `stock`, `publication_date`, `created_at`, `created_by`, `updated_at`, `updated_by`, `deleted`)
SELECT * FROM (
    SELECT UUID() AS `id`, '9781234567890' AS `isbn`, 'Book One' AS `title`,
        (SELECT id FROM authors LIMIT 1) AS author_id,
        (SELECT id FROM publishers LIMIT 1) AS publisher_id,
        (SELECT id FROM genres LIMIT 1) AS genre_id,
        10 AS stock, '2022-01-10' AS publication_date, NOW() AS created_at, 'system' AS created_by, NOW() AS updated_at, 'system' AS updated_by, 0 AS deleted
) AS tmp
WHERE tmp.author_id IS NOT NULL AND tmp.publisher_id IS NOT NULL AND tmp.genre_id IS NOT NULL
AND NOT EXISTS (SELECT 1 FROM `books` WHERE `isbn` = '9781234567890');

INSERT INTO `books` (`id`, `isbn`, `title`, `author_id`, `publisher_id`, `genre_id`, `stock`, `publication_date`, `created_at`, `created_by`, `updated_at`, `updated_by`, `deleted`)
SELECT * FROM (
    SELECT UUID() AS `id`, '9782345678901' AS `isbn`, 'Book Two' AS `title`,
        (SELECT id FROM authors LIMIT 1) AS author_id,
        (SELECT id FROM publishers LIMIT 1) AS publisher_id,
        (SELECT id FROM genres LIMIT 1) AS genre_id,
        5 AS stock, '2023-02-15' AS publication_date, NOW() AS created_at, 'system' AS created_by, NOW() AS updated_at, 'system' AS updated_by, 0 AS deleted
) AS tmp WHERE NOT EXISTS (SELECT 1 FROM `books` WHERE `isbn` = '9782345678901');

INSERT INTO `books` (`id`, `isbn`, `title`, `author_id`, `publisher_id`, `genre_id`, `stock`, `publication_date`, `created_at`, `created_by`, `updated_at`, `updated_by`, `deleted`)
SELECT * FROM (
    SELECT UUID() AS `id`, '9783456789012' AS `isbn`, 'Book Three' AS `title`,
        (SELECT id FROM authors LIMIT 1) AS author_id,
        (SELECT id FROM publishers LIMIT 1) AS publisher_id,
        (SELECT id FROM genres LIMIT 1) AS genre_id,
        8 AS stock, '2024-03-20' AS publication_date, NOW() AS created_at, 'system' AS created_by, NOW() AS updated_at, 'system' AS updated_by, 0 AS deleted
) AS tmp WHERE NOT EXISTS (SELECT 1 FROM `books` WHERE `isbn` = '9783456789012');

-- book_loan_histories テーブルの作成
CREATE TABLE IF NOT EXISTS `loan_histories` (
  `id` varchar(100) NOT NULL COMMENT 'ID',
  `book_id` varchar(100) NOT NULL COMMENT '書籍ID',
  `user_id` varchar(100) NOT NULL COMMENT 'ユーザーID',
  `loaned_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '貸し出し日',
  `return_due_on` date NOT NULL COMMENT '返却期限日',
  `returned_at` timestamp DEFAULT NULL COMMENT '返却日時',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日時',
  `created_by` varchar(100) NOT NULL COMMENT '作成者ID',
  `updated_at` timestamp COMMENT '更新日時',
  `updated_by` varchar(100) COMMENT '更新者ID',
  `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '削除フラグ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='書籍貸し出し履歴';

-- 初期データの挿入
INSERT INTO loan_histories (id, book_id, user_id, loaned_at, return_due_on, returned_at, created_at, created_by, updated_at, updated_by, deleted)
SELECT UUID() AS id, b.id AS book_id, u.id AS user_id,
       '2025-05-22 19:47:19' AS loaned_at, '2025-05-30' AS return_due_on, NULL AS returned_at,
       '2025-05-22 19:47:19' AS created_at, u.id AS created_by,
       NULL AS updated_at, NULL AS updated_by, 0 AS deleted
FROM books b
         JOIN users u ON u.email = 'admin@example.com'
WHERE b.isbn = '9781234567890';

INSERT INTO loan_histories (id, book_id, user_id, loaned_at, return_due_on, returned_at, created_at, created_by, updated_at, updated_by, deleted)
SELECT UUID() AS id, b.id AS book_id, u.id AS user_id,
       '2025-05-22 19:44:20' AS loaned_at, '2025-04-30' AS return_due_on, NULL AS returned_at,
       '2025-05-22 19:44:20' AS created_at, u.id AS created_by,
       NULL AS updated_at, NULL AS updated_by, 0 AS deleted
FROM books b
         JOIN users u ON u.email = 'admin@example.com'
WHERE b.isbn = '9782345678901';

INSERT INTO loan_histories (id, book_id, user_id, loaned_at, return_due_on, returned_at, created_at, created_by, updated_at, updated_by, deleted)
SELECT UUID() AS id, b.id AS book_id, u.id AS user_id,
       '2025-05-19 18:51:44' AS loaned_at, '2025-05-20' AS return_due_on, NULL AS returned_at,
       '2025-05-19 18:51:44' AS created_at, u.id AS created_by,
       NULL AS updated_at, NULL AS updated_by, 0 AS deleted
FROM books b
         JOIN users u ON u.email = 'admin@example.com'
WHERE b.isbn = '9783456789012';

-- 書籍の在庫数を更新
UPDATE books SET stock = stock - 1
WHERE id IN (
    SELECT book_id FROM loan_histories WHERE returned_at IS NULL
);
