## nacos 使用
### 安装
1. 下载解压
2. 修改 bin/startup.sh
    > `#!/bin/sh` 改为 `#!bin/bash`
3. 将conf/nacos-mysql.sql导入nacos_config库中
4. 单机启动
   > bin/startup.sh -m standalone
5. 访问
   [管理界面](http://localhost:8848/nacos "nacos/nacos")

### 注册中心

### 配置中心