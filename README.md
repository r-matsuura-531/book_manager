# 動作確認方法

1. developブランチをチェックアウトしてください。
2. プロジェクト配下で以下のコマンドを実行してください。

```
$ docker-compose up -d
```

3. アプリケーションを起動してください。
4. 以下のコマンドを実行してください。

```
curl -i -X GET \
   -H "Authorization:Basic YWRtaW5AZXhhbXBsZS5jb206cGFzc3dvcmQ=" \
 'http://localhost:8080/books'
```

# 初期データ（ユーザー情報）

| ユーザー名 | パスワード    |
|:------|:---------|
| admin | password |
| user  | password |