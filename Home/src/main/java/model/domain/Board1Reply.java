package model.domain;

public class Board1Reply {
	
	private int replyNo;
	private int no;
	private String id;
	private String reply;
	private String reDate;
	
	public Board1Reply() {
		super();
	}

	public Board1Reply(int replyNo, int no, String id, String reply,
			String reDate) {
		super();
		this.replyNo = replyNo;
		this.no = no;
		this.id = id;
		this.reply = reply;
		this.reDate = reDate;
	}

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
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

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getReDate() {
		return reDate;
	}

	public void setReDate(String reDate) {
		this.reDate = reDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board1Reply [replyNo=");
		builder.append(replyNo);
		builder.append(", no=");
		builder.append(no);
		builder.append(", id=");
		builder.append(id);
		builder.append(", reply=");
		builder.append(reply);
		builder.append(", reDate=");
		builder.append(reDate);
		builder.append("]");
		return builder.toString();
	}
	
}