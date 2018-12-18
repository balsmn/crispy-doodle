# Crispy Doodle

Sample application to demonstrate the use of fabric8 maven plugin to generate docker images, push docker images to docker hub, generate helm charts and apply the same to kubernetes.

## Compiling for local environment
In order to prepare the required docker images and K8S YAML files, use the following command

```
mvn clean install -Plocal
```

To deploy either you can use helm. Execute the following command from within the exchange-rate module.

```
helm install -n exchange-rate target/exchange-rate-1.0.0-SNAPSHOT-helm.tar.gz 
```

or you can also use fabric:apply command to deploy

```
mvn fabric8:apply -Plocal
```