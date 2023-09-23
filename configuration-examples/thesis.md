1. BS thesis: **Service for running and visualizing feedback control scenarios**
2. The idea of task is to create web-server for orchestrating two types of services: client and server. 
   Both of them will implement some SRE practises. Goal of orchestrator is to provide tool for configuring tune parameters of its practises 
   and run load-testing scenarious using these clients and servers to check how optimal to use these practises
   
   **The task can be divided into several steps:**
   1. Learn how to run and tune yandex tank. Also how to export test results
   2. Create a protocol of communication between orchestrator and clients. It's needed to provide api and format of messages. Clients will be able to register itself, change configuration by orchestrator and take part in load-testing. Clients will be created by Vagif and Vadim
   3. Create and deploy a web-service for configuration clients and starting yandex tank using K8S
   4. Conduct several testing scenarious for clients
   
3. List of literature and related work
    * https://sre.google/sre-book/part-I-introduction/
    * https://kubernetes.io/
    * https://yandextank.readthedocs.io/en/latest/
    * https://habr.com/ru/articles/651653/
    * https://kafka.apache.org/documentation/
    * https://developer.hashicorp.com/consul/docs
4. Thesis code - https://github.com/edikgoose/iu-feedback-control-orchestrator
5. Thesis text - https://github.com/edikgoose/iu-thesis
6. Weekly meetings - 14:30, Monday