package co.grandcircus.DonutApi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Donut {
	
	private Long id;
	private String ref;
	private String name;
	private Integer calories;
	private List<String> extras;
	private String photo;
	@JsonProperty("photo_attribution")
	private String photoAttribution;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public List<String> getExtras() {
		return extras;
	}
	public void setExtras(List<String> extras) {
		this.extras = extras;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPhotoAttribution() {
		return photoAttribution;
	}
	public void setPhotoAttribution(String photoAttribution) {
		this.photoAttribution = photoAttribution;
	}
	@Override
	public String toString() {
		return "Donut [id=" + id + ", ref=" + ref + ", name=" + name + ", calories=" + calories + ", extras=" + extras
				+ ", photo=" + photo + ", photoAttribution=" + photoAttribution + "]";
	}
	
	
}
