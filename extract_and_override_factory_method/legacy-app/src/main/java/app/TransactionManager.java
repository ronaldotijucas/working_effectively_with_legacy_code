package app;

public class TransactionManager implements ITransactionManager {
  public TransactionManager(Reader reader, Persister persister) {
    // do some complex stuff
  }

  public void greeting() {
    System.out.println("Hey I am the TransactionManager");
  }
}
