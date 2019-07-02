# Creating a Groovy action for Apache OpenWhisk

This is a minimum example to show how to run an [Apache Groovy](https://github.com/apache/groovy)
based action on [Apache OpenWhisk](https://github.com/apache/incubator-openwhisk).

## Instructions:

1. Install the [OpenWhisk CLI and set it up](https://github.com/apache/incubator-openwhisk/blob/master/docs/cli.md)
2. `./gradlew jar`
3. `wsk action create groovy build/libs/openwhisk-groovy.jar --main Hello`
4. `wsk action invoke groovy -r -p name "Groovy"`

Output will be:
```json
{
    "message": "Groovy Rocks on OpenWhisk!"
}
```
