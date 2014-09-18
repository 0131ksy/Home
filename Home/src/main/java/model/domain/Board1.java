package model.domain;

public class Board1 {
	
	private int no;
	private String id;
	private String title;
	private String body;
	private String wrDate;
	
	public Board1() {
		super();
	}

	public Board1(int no, String id, String title, String body, String wrDate) {
		super();
		this.no = no;
		this.id = id;
		this.title = title;
		this.body = body;
		this.wrDate = wrDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getWrDate() {
		return wrDate;
	}

	public void setWrDate(String wrDate) {
		this.wrDate = wrDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board1 [no=");
		builder.append(no);
		builder.append(", id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", body=");
		builder.append(body);
		builder.append(", wrDate=");
		builder.append(wrDate);
		builder.append("]");
		return builder.toString();
	}

}