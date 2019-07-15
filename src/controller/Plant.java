package controller;

/**
 * Basic Plant Object.
 *
 * @author Jake Graham
 * @version
 */
public class Plant {

	// Basic Information
	private String name;
	private Integer waterAmount; // in ml
	private Integer waterFreq; // frequency of watering plants

	// Additional information
	private Integer expectedHeight; // in cm
	private Integer lightLevel; // low, medium, high
	// private Integer lowTemp;
	// private Integer highTemp;
	// private Boolean herb;
	// private Boolean fruit;
	private Integer seasons; // times of year it is active
	private String webPage; // link to more information

	/**
	 * @param name
	 * @param waterAmount
	 * @param waterFreq
	 */
	public Plant(String name, Integer waterAmount, Integer waterFreq) {
		this.name = name;
		this.waterAmount = waterAmount;
		this.waterFreq = waterFreq;
	}

	/**
	 * @param name
	 * @param expectedHeight
	 * @param waterAmount
	 * @param waterFreq
	 * @param lightLevel
	 * @param lowTemp
	 * @param highTemp
	 * @param herb
	 * @param fruit
	 * @param seasons
	 * @param webPage
	 */
	public Plant(String name, Integer waterAmount, Integer waterFreq, Integer expectedHeight, Integer lightLevel,
			Integer lowTemp, Integer highTemp, Boolean herb, Boolean fruit, Integer seasons, String webPage) {
		this.name = name;
		this.waterAmount = waterAmount;
		this.waterFreq = waterFreq;
		this.expectedHeight = expectedHeight;
		this.lightLevel = lightLevel;
		this.lowTemp = lowTemp;
		this.highTemp = highTemp;
		this.herb = herb;
		this.fruit = fruit;
		this.seasons = seasons;
		this.webPage = webPage;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the waterAmount
	 */
	public Integer getWaterAmount() {
		return waterAmount;
	}

	/**
	 * @return the waterFreq
	 */
	public Integer getWaterFreq() {
		return waterFreq;
	}

	/**
	 * @return the expectedHeight
	 */
	public Integer getExpectedHeight() {
		return expectedHeight;
	}

	/**
	 * @return the lightLevel
	 */
	public Integer getLightLevel() {
		return lightLevel;
	}

	/**
	 * @return the lowTemp
	 */
	public Integer getLowTemp() {
		return lowTemp;
	}

	/**
	 * @return the highTemp
	 */
	public Integer getHighTemp() {
		return highTemp;
	}

	/**
	 * @return the herb
	 */
	public Boolean getHerb() {
		return herb;
	}

	/**
	 * @return the fruit
	 */
	public Boolean getFruit() {
		return fruit;
	}

	/**
	 * @return the seasons
	 */
	public Integer getSeasons() {
		return seasons;
	}

	/**
	 * @return the webPage
	 */
	public String getWebPage() {
		return webPage;
	}

}
