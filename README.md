# Автотесты для сайта проекта [Ночлежка](https://homeless.ru//)
![image](src/test/resources/img/homeless_mainpage.png)
## Автотесты написаны с использованием:

| Java | Gradle | Junit5 | Selenide | Jenkins | Selenoid | Allure Report | Allure TestOps | 
|:----:|:------:|:------:|:--------:|:-------:|:--------:|:---------------:|:--------------:|
| <img src="src/test/resources/img/Java.svg" width="40" height="40"> | <img src="src/test/resources/img/Gradle.svg" width="40" height="40"> | <img src="src/test/resources/img/JUnit5.svg" width="40" height="40"> | <img src="src/test/resources/img/Selenide.svg" width="40" height="40"> | <img src="src/test/resources/img/Jenkins.svg" width="40" height="40"> | <img src="src/test/resources/img/Selenoid.svg" width="40" height="40"> | <img src="src/test/resources/img/Allure_Report.svg" width="40" height="40"> | <img src="src/test/resources/img/Allure_EE.svg" width="40" height="40"> | 

## Список проверок, реализованных в автотестах:

- [X] - Opening the main page
- [X] - Check the default state of the main page (title, errors in console log)

## Пример видеозаписи прохождения теста
![video]()
<br><br>
## Screenshots
#### *Selenoid is used to implement the Selenium protocol::*
![image]()
<br />
<br />
#### *Jenkins was used as a CI system*
![image]()
<br />
<br />
#### *Allure Report is connected to build reports:*
![image]()
![image]()
<br />
<br />
#### *Allure TestOps was used as a Test Management system:*
![image]()
![image]()
![image]()
<br />
<br />
#### *Настроено автоматическое оповещение о результатах запуска тестов в Jenkins в Telegram-чат:*
![image]()
<br />
<br />
Run tests with filled local.properties:
```bash
gradle clean test
```

Run tests with not filled local.properties:
```bash
gradle clean -DremoteDriverUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve allure report:
```bash
allure serve build/allure-results
```

Thanks :pray:<br/>
:green_heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
