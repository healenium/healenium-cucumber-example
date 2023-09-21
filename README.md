# healenium-cucumber-example

[![Docker Pulls](https://img.shields.io/docker/pulls/healenium/hlm-backend.svg?maxAge=25920)](https://hub.docker.com/u/healenium)
[![License](https://img.shields.io/badge/license-Apache-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

[1. Start Healenium components](#1-start-healenium-components)
* [Healenium with Selenium-Grid](#run-healenium-with-selenium-grid)
* [Healenium without Docker](#run-healenium-without-docker)


[2. Configuration RemoteWebDriver for Healenium](#2-configuration-remotewebdriver-for-healenium)

[3. Run test](#3-run-test)


## How to start

### 1. Start Healenium components

Go into healenium folder or download 

```sh
cd healenium
```

#### Run Healenium with Selenium-Grid:
```sh
docker-compose up -d
```

#### Run Healenium without Docker:

Documanetation: https://healenium.io/docs/download_and_install/hlm_proxy

### 2. Configuration RemoteWebDriver for Healenium

To run tests using Healenium, create a Remote Web Driver with URL ```http://<hlm-proxy-host>:<hlm-proxy-port>```.  
In the case of a local launch: http://localhost:8085

```java
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:8085"), options);
```

### 3. Run test
To run tests in terminal with maven you need to go to execute next commands:

```sh
mvn clean test
```

## Community / Support

* [Telegram chat](https://t.me/healenium)
* [YouTube Channel](https://www.youtube.com/channel/UCsZJ0ri-Hp7IA1A6Fgi4Hvg)

