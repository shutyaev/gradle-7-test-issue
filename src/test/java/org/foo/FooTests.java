package org.foo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FooTests {

  @ParameterizedTest
  @ValueSource(chars = { 'a', 'b', 'c' })
  public void test(char x) {
    var foo = new Foo();
    var value = foo.foo();
    assertTrue(value.contains(String.valueOf(x)));
  }

}
