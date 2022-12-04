package eu.macphail;

import org.apache.camel.builder.RouteBuilder;

import static org.apache.camel.builder.endpoint.StaticEndpointBuilders.kafka;
import static org.apache.camel.builder.endpoint.StaticEndpointBuilders.timer;

public class ExampleRoute extends RouteBuilder {

  @Override
  public void configure() throws Exception {
    from(timer("foo").period(1000))
          .to(kafka("test").brokers("kafka-1:19092"));
  }
}
