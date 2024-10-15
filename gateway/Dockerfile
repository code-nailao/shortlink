# 使用带有 Maven 的基础镜像（不包含 JDK）
FROM maven:3.8.1-slim AS builder

# 设置工作目录
WORKDIR /app

# 复制 pom.xml 和源代码
COPY pom.xml .
COPY src ./src

# 下载并安装 Zulu JDK 17.0.8.1
RUN apt-get update && \
    apt-get install -y wget unzip && \
    wget https://cdn.azul.com/zulu/bin/zulu17.44.53-ca-jdk17.0.8.1-linux_x64.zip && \
    unzip zulu17.44.53-ca-jdk17.0.8.1-linux_x64.zip -d /opt && \
    rm zulu17.44.53-ca-jdk17.0.8.1-linux_x64.zip

# 设置 JAVA_HOME 环境变量
ENV JAVA_HOME=/opt/zulu17.44.53-ca-jdk17.0.8.1-linux_x64
ENV PATH="$JAVA_HOME/bin:$PATH"

# 构建应用程序包
RUN mvn package -DskipTests

# 使用基础镜像运行应用程序（可以是一个轻量级的基础镜像）
FROM debian:bullseye-slim

# 复制构建阶段的 JDK 和应用程序包
COPY --from=builder /opt/zulu17.44.53-ca-jdk17.0.8.1-linux_x64 /opt/zulu17.44.53-ca-jdk17.0.8.1-linux_x64
COPY --from=builder /app/target/yubi-backend-0.0.1-SNAPSHOT.jar /app/target/yubi-backend-0.0.1-SNAPSHOT.jar

# 设置 JAVA_HOME 环境变量
ENV JAVA_HOME=/opt/zulu17.44.53-ca-jdk17.0.8.1-linux_x64
ENV PATH="$JAVA_HOME/bin:$PATH"

# 启动应用程序
CMD ["java","-jar","/app/target/shortlink-gateway.jar","-Ddatabase.env=prod"]