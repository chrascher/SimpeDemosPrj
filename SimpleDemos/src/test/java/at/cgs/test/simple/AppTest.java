package at.cgs.test.simple;



import at.cgs.test.simple.hash.Test2DTO;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

  @Test public void testSimple() {

    List<Test2DTO> testDTOList = new ArrayList<Test2DTO>();

    Test2DTO testdto = new Test2DTO();
    testdto.setId("1");
    testdto.setParamTwo(null);
    testDTOList.add(testdto);

    // send DTO to rest client
    // get new DTO from rest client filled with paramTwo
    Test2DTO testdtoFromClient = new Test2DTO();
    testdtoFromClient.setId("1");
    testdtoFromClient.setId("one");

    boolean res = testDTOList.contains(testdtoFromClient);
    assertTrue(res); // expected: <true> but was: <false> if Two is set in new object

  }


}
