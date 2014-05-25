/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package suite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import controller.*;
import model.*;

/**
 *
 * @author lucas
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ControllerTest.class, PlayerTest.class, AlienTest.class,
BarreiraTest.class})
public class TestSuite {
    
}
