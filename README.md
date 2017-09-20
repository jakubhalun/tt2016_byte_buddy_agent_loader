# Byte Buddy Agent Loader

Attaches Java Agent to Virtual Machine with a provided process id. Uses Byte Buddy Agent as alternative to [Attach API](https://github.com/jakubhalun/tt2016_attach_api_agent_loader).

This is part of demo of Byte Buddy Java Agent prepared for Motorola Tech Talks 2016 in Kraków.

Other parts of demo:

* [Java Agent](https://github.com/jakubhalun/tt2016_byte_buddy_agent_demo)
* [Instrumented application](https://github.com/jakubhalun/tt2016_byte_buddy_agent_demo_instrumented_app)

## Execution
Find process id of a Java Virtual Machine:

```
jps
```

Example output:

    $ jps
    10160
    7832 jar
    3356 Jps

Load java agent:

```
java -jar byte-buddy-agent-loader.jar  7832  byte-buddy-agent-demo.jar
```