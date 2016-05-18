package com.lbis.aerovibe.model;

import com.lbis.database.model.KeyObjectIfc;
import com.lbis.database.model.ValueObjectIfc;
import java.io.Serializable;

public class Token implements ValueObjectIfc<Token>, KeyObjectIfc, Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3159473668030796791L;
    private String tokenId;
    private String tokenValue;
    private String tokenUserId;

    public Token(String tokenValue, String tokenUserId) {
        this.tokenValue = tokenValue;
        this.tokenUserId = tokenUserId;
        this.tokenId = "token_" + tokenValue;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    public String getTokenUserId() {
        return tokenUserId;
    }

    public void setTokenUserId(String tokenUserId) {
        this.tokenUserId = tokenUserId;
    }

    public Class<Token> getClassType() {
        return Token.class;
    }

    public String getObjectKey() {
        return "token_" + tokenValue;
    }

    public String getSQLObjectKey() {
        return getObjectKey();
    }
}
