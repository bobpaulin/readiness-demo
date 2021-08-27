# Http Client Readiness Warmup

## Build

Windows

```
mvnw.cmd clean package
```

Linux/Mac

```
mvnw clean package
```

## Run without Warmup

Windows

```
set RUN_WARMUP_TIMES=0
java -jar readiness-demo-0.0.1-SNAPSHOT.jar
```

Linux/mac

```
export RUN_WARMUP_TIMES=0
java -jar readiness-demo-0.0.1-SNAPSHOT.jar
```

## Run with Warmup

Windows

```
set RUN_WARMUP_TIMES=1
java -jar readiness-demo-0.0.1-SNAPSHOT.jar
```

Linux/mac

```
export RUN_WARMUP_TIMES=1
java -jar readiness-demo-0.0.1-SNAPSHOT.jar
```

