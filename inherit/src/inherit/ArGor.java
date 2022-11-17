package inherit;

public class ArGor extends AkademikPersonel{
	
	protected ArGor(String adi, String soyadi, String email, String departman, String unvanArgor) {
		super(adi, soyadi, email, departman);
		this.unvanArgor = unvanArgor;
	}
	
	

	protected String unvanArgor;
	
	
	

	protected String getUnvanArgor() {
		return unvanArgor;
	}

	protected void setUnvanArgor(String unvanArgor) {
		this.unvanArgor = unvanArgor;
	}

	@Override
	protected String cikis() {
		// TODO Auto-generated method stub
		return "fak cikis";
	}
	
	
}
