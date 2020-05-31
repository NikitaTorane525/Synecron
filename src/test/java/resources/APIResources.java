package resources;

// Enum is special class which has constants and methods
public enum APIResources {

	ratesapi("/api/2010-01-11");

	private String resource;

	APIResources(String resource) {
		this.resource = resource;
	}

	public String getResource() {
		return resource;
	}

}
