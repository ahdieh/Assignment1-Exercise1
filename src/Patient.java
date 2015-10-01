
public class Patient {
	// PRIVATE INSTANCE VARIABLES ++++++++++++++++++++++++++++++++++++++
	private String _patientId;
	private String _firstName;
	private String _lastName;
	private String _address;
	private String _city;
	private String _province;
	private String _postalCode;
	
	// PROPERTIES +++++++++++++++++++++++++++++++++++++++++++++++
		public String getPatientId() {
			return this._patientId;
		}

		public void setPatientId(String patientId) {
			this._patientId = patientId;
		}
		
		public String getFirstName() {
			return this._firstName;
		}
		
		public void setFirstName(String firstName) {
			this._firstName = firstName;
		}
		
		public String getLastName() {
			return this._lastName;
		}
		
		public void setLastName(String lastName) {
			this._lastName = lastName;
		}
		public String getAddress() {
			return this._address;
		}
		
		public void setAddress(String address) {
			this._address = address;
		}
		public String getCity() {
			return this._city;
		}
		
		public void setCity(String city) {
			this._city = city;
		}
		public String getProvince() {
			return this._province;
		}
		
		public void setProvince(String province) {
			this._province = province;
		}
		public String getPostalCode() {
			return this._postalCode;
		}
		
		public void setPostalCode(String postalCode) {
			this._postalCode = postalCode;
		}
		
		// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++
		public Patient () {
			this.Initialize("Unknowm", "Unknowm", "Unknowm", "Unknowm", "Unknowm", "Unknowm", "Unknowm");
		}
		
		// PRIVATE METHOD
		private void Initialize(String patientId, String firstName , String lastName, String address, String city, String province, String postalCode){
			this.setPatientId(patientId);
			this.setFirstName(firstName);
			this.setLastName(lastName);
			this.setAddress(address);
			this.setCity(city);
			this.setProvince(province);
			this.setPostalCode(postalCode);
				
		}
		
		public void getPatientInfo() {
			System.out.printf("%s %s's Patient Information: \n", getFirstName(), getLastName());
		}
}
