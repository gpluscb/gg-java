package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A user's address
 */
public class AddressResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final StringResponse city;
	private final StringResponse country;
	private final IntResponse countryId;
	private final StringResponse state;
	private final IntResponse stateId;

	public AddressResponse() {
		super(EntityType.ADDRESS);

		id = null;
		city = null;
		country = null;
		countryId = null;
		state = null;
		stateId = null;
	}

	public AddressResponse(IDResponse id, StringResponse city, StringResponse country, IntResponse countryId, StringResponse state, IntResponse stateId) {
		super(EntityType.ADDRESS, true);
		this.id = id;
		this.city = city;
		this.country = country;
		this.countryId = countryId;
		this.state = state;
		this.stateId = stateId;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public StringResponse getCity() {
		checkProvided();
		return city;
	}

	public StringResponse getCountry() {
		checkProvided();
		return country;
	}

	public IntResponse getCountryId() {
		checkProvided();
		return countryId;
	}

	public StringResponse getState() {
		checkProvided();
		return state;
	}

	public IntResponse getStateId() {
		checkProvided();
		return stateId;
	}
}
