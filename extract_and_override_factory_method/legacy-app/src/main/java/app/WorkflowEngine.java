package app;

public class WorkflowEngine {
  private ITransactionManager transactionManager;

  public WorkflowEngine () {
    Reader reader = new Reader();
    Persister persister = new Persister();
    this.transactionManager = new TransactionManager(reader, persister);
  }

  public void hello() {
    this.transactionManager.greeting();
  }
}
