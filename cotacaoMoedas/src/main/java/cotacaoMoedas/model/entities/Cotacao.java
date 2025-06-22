package cotacaoMoedas.model.entities;

public class Cotacao {

	private String code;
	private String codein;
	private String name;
	private double high;
	private double low;
	private double varBid;
	private double pctChange;
	private String bid;
	private String ask;
	private String timestamp;
	private String create_date;

	public Cotacao() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodein() {
		return codein;
	}

	public void setCodein(String codein) {
		this.codein = codein;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getVarBid() {
		return varBid;
	}

	public void setVarBid(double varBid) {
		this.varBid = varBid;
	}

	public double getPctChange() {
		return pctChange;
	}

	public void setPctChange(double pctChange) {
		this.pctChange = pctChange;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getAsk() {
		return ask;
	}

	public void setAsk(String ask) {
		this.ask = ask;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
}
