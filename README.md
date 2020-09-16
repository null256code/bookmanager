# README

- kotlin × micronautの書籍管理アプリ(※課題で作成)

## 実行

- 以下コマンドでリポジトリ取得・実行
```
git clone https://github.com/null256code/bookmanager
cd bookmanager
gradlew run
```

- `http://localhost:8080/` にAPIサーバが立つ

### エンドポイント

- `GET /book/find/{id}`
  - 最初のデータのままだと次のパスで結果返ってくる `http://localhost:8080/book/find/1`


### デバッグ

- 以下にアクセスするとDB(H2)確認できる  
`http://localhost:8082/`

## 環境

- プロジェクト作成時は以下のコマンドで作成している  
`mn create-app bookmanager --lang=kotlin`

### 各バージョン
```
micronautVersion=2.0.1
kotlinVersion=1.3.72
```
```
java {
    sourceCompatibility = JavaVersion.toVersion('11')
}
>java --version
openjdk 11 2018-09-25
OpenJDK Runtime Environment AdoptOpenJDK (build 11+28)
OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11+28, mixed mode)
```

### 使用ライブラリ
- Gradle
- H2 Database
- [micronaut-data(JPA/Hibernate)](https://micronaut-projects.github.io/micronaut-data/latest/guide/)
- [Flyway](https://micronaut-projects.github.io/micronaut-flyway/latest/guide/index.html)

### エディタ
- IntelliJ IDEA 2020.2.1 (Community Edition)

## 設計に関して
- クリーンアーキテクチャ風で構成
  - 今の所レイヤーでプロジェクト分けたりはしていない
  - Webでの利用しか殆ど想定していないので、Presenterは使わない形にする
- Infra層はCQRSで実装する(予定)
  - repositories: domeins.modelを返す
  - queries: 結果セットをそのまま返す
