package com.fortsolution.lyonmag.model;

import java.io.Serializable;

public class Theme implements Serializable{
String headerthem,headerdetail,imageheadertxt,imageheaderdetail;


public String getImageheadertxt() {
	return imageheadertxt;
}

public void setImageheadertxt(String imageheadertxt) {
	this.imageheadertxt = imageheadertxt;
}

public String getImageheaderdetail() {
	return imageheaderdetail;
}

public void setImageheaderdetail(String imageheaderdetail) {
	this.imageheaderdetail = imageheaderdetail;
}

public String getHeaderthem() {
	return headerthem;
}

public void setHeaderthem(String headerthem) {
	this.headerthem = headerthem;
}

public String getHeaderdetail() {
	return headerdetail;
}

public void setHeaderdetail(String headerdetail) {
	this.headerdetail = headerdetail;
}

}
