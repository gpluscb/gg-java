package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.*;

/**
 * A user's address
 */
public class AddressResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final IntResponse userId;
	private final StringResponse nameFirst;
	private final StringResponse nameLast;
	private final StringResponse address;
	private final StringResponse address2;
	private final StringResponse city;
	private final StringResponse state;
	private final IntResponse stateId;
	private final StringResponse country;
	private final IntResponse countryId;
	private final StringResponse zipcode;
	private final StringResponse phoneNumber;
	private final TimestampResponse createdAt;
	private final TimestampResponse updatedAt;
	private final StringResponse type;
	private final BooleanResponse overrideAddress;

	public AddressResponse() {
		super(EntityType.ADDRESS);

		id = null;
		userId = null;
		nameFirst = null;
		nameLast = null;
		address = null;
		address2 = null;
		city = null;
		state = null;
		stateId = null;
		country = null;
		countryId = null;
		zipcode = null;
		phoneNumber = null;
		createdAt = null;
		updatedAt = null;
		type = null;
		overrideAddress = null;
	}

	public AddressResponse(IDResponse id, IntResponse userId, StringResponse nameFirst, StringResponse nameLast, StringResponse address, StringResponse address2, StringResponse city, StringResponse state, IntResponse stateId, StringResponse country, IntResponse countryId, StringResponse zipcode, StringResponse phoneNumber, TimestampResponse createdAt, TimestampResponse updatedAt, StringResponse type, BooleanResponse overrideAddress) {
		super(EntityType.ADDRESS, true);
		this.id = id;
		this.userId = userId;
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.stateId = stateId;
		this.country = country;
		this.countryId = countryId;
		this.zipcode = zipcode;
		this.phoneNumber = phoneNumber;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.type = type;
		this.overrideAddress = overrideAddress;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public IntResponse getUserId() {
		checkProvided();
		return userId;
	}

	public StringResponse getNameFirst() {
		checkProvided();
		return nameFirst;
	}

	public StringResponse getNameLast() {
		checkProvided();
		return nameLast;
	}

	public StringResponse getAddress() {
		checkProvided();
		return address;
	}

	public StringResponse getAddress2() {
		checkProvided();
		return address2;
	}

	public StringResponse getCity() {
		checkProvided();
		return city;
	}

	public StringResponse getState() {
		checkProvided();
		return state;
	}

	public IntResponse getStateId() {
		checkProvided();
		return stateId;
	}

	public StringResponse getCountry() {
		checkProvided();
		return country;
	}

	public IntResponse getCountryId() {
		checkProvided();
		return countryId;
	}

	public StringResponse getZipcode() {
		checkProvided();
		return zipcode;
	}

	public StringResponse getPhoneNumber() {
		checkProvided();
		return phoneNumber;
	}

	public TimestampResponse getCreatedAt() {
		checkProvided();
		return createdAt;
	}

	public TimestampResponse getUpdatedAt() {
		checkProvided();
		return updatedAt;
	}

	public StringResponse getType() {
		checkProvided();
		return type;
	}

	public BooleanResponse getOverrideAddress() {
		checkProvided();
		return overrideAddress;
	}
}
