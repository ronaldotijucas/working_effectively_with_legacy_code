package app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

class FakeTransactionManager implements ITransactionManager {
  public void greeting() {
    System.out.println("Hey I am the FakeTransactionManager");
  }
}

class TestWorkflowEngine extends WorkflowEngine {
  protected ITransactionManager makeTransactionManager() {
    return new FakeTransactionManager();
  }
}

public class WorkflowEngineTest extends TestCase {

    public WorkflowEngineTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(WorkflowEngineTest.class);
    }

    public void testApp() {
        WorkflowEngine workflowEngine = new TestWorkflowEngine();
        assertTrue( true );
    }
}
