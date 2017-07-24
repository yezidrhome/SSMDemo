package cn.SpringDemo.model.result;

/**
 * 
 * @author yezi
 *
 * @param <T>
 */
public class ResultDO<T> {
	private String message;
	private T result;
	private boolean success;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
