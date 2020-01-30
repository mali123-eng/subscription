package com.subscription.client.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="jwt")
public class JwtConfig {
private String secretKey;
private long expirationTimeInMiliSecond;
private long expirationTimeInMiliSecondForEmailURL;
private String headerName;
private String tokenStartingWord;
private String emailVerificationUrl;

public String getSecretKey() {
	return secretKey;
}
public void setSecretKey(String secretKey) {
	this.secretKey = secretKey;
}
public long getExpirationTimeInMiliSecond() {
	return expirationTimeInMiliSecond;
}
public void setExpirationTimeInMiliSecond(long expirationTimeInMiliSecond) {
	this.expirationTimeInMiliSecond = expirationTimeInMiliSecond;
}
public String getHeaderName() {
	return headerName;
}
public void setHeaderName(String headerName) {
	this.headerName = headerName;
}
public String getTokenStartingWord() {
	return tokenStartingWord;
}
public void setTokenStartingWord(String tokenStartingWord) {
	this.tokenStartingWord = tokenStartingWord;
}
public long getExpirationTimeInMiliSecondForEmailURL() {
	return expirationTimeInMiliSecondForEmailURL;
}
public void setExpirationTimeInMiliSecondForEmailURL(long expirationTimeInMiliSecondForEmailURL) {
	this.expirationTimeInMiliSecondForEmailURL = expirationTimeInMiliSecondForEmailURL;
}
public String getEmailVerificationUrl() {
	return emailVerificationUrl;
}
public void setEmailVerificationUrl(String emailVerificationUrl) {
	this.emailVerificationUrl = emailVerificationUrl;
}
}
