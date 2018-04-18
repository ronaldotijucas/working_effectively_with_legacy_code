package app;

public class WorkflowEngine {
  private ITransactionManager transactionManager;

  public WorkflowEngine () {
    this.transactionManager = makeTransactionManager();
  }

  protected ITransactionManager makeTransactionManager() {
    Reader reader = new Reader();
    Persister persister = new Persister();
    return new TransactionManager(reader, persister);
  }

  public void hello() {
    this.transactionManager.greeting();
  }
}
