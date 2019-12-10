package dto;

public class ProductDto {
	
	private String name;
	private String version;
	private String model;
	private String descriptions;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	@Override
	public String toString() {
		return "ProductDto [name=" + name + ", version=" + version + ", model=" + model + ", descriptions="
				+ descriptions + "]";
	}
	
	
	

}
