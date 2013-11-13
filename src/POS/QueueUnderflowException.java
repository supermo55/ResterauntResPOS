package POS;

public class QueueUnderflowException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public QueueUnderflowException() {
            super();
            // TODO Auto-generated constructor stub
    }

    public QueueUnderflowException(String arg0, Throwable arg1, boolean arg2,
                    boolean arg3) {
            super(arg0, arg1, arg2, arg3);
            // TODO Auto-generated constructor stub
    }

    public QueueUnderflowException(String arg0, Throwable arg1) {
            super(arg0, arg1);
            // TODO Auto-generated constructor stub
    }

    public QueueUnderflowException(String arg0) {
            super(arg0);
            // TODO Auto-generated constructor stub
    }

    public QueueUnderflowException(Throwable arg0) {
            super(arg0);
            // TODO Auto-generated constructor stub
    }

}