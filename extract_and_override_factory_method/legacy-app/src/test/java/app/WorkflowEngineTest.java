package app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class WorkflowEngineTest extends TestCase {

    public WorkflowEngineTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(WorkflowEngineTest.class);
    }

    public void testApp() {
        WorkflowEngine workflowEngine = new WorkflowEngine();
        assertTrue( true );
    }
}
