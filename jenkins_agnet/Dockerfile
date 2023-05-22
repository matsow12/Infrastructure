FROM jenkins/ssh-agent:4.2.1-jdk11
USER root

RUN apt-get update && apt-get install -y curl python3 python3-pip unzip ansible git

RUN groupadd -g 997 docker && usermod -aG docker jenkins

RUN curl -fsSL https://get.docker.com/ | sh

RUN curl -L https://github.com/docker/compose/releases/download/v2.18.1/docker-compose-linux-x86_64 -o /usr/local/bin/docker-compose && chmod +X /usr/local/bin/docker-compose

RUN curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip" && unzip awscliv2.zip && ./aws/install
