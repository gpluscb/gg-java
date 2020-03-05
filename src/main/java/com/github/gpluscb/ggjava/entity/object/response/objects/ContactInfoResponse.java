package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * Name, address, etc
 */
public class ContactInfoResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final StringResponse city;
	private final StringResponse country;
	private final IntResponse countryId;
	private final StringResponse name;
	private final StringResponse nameFirst;
	private final StringResponse nameLast;
	private final StringResponse state;
	private final IntResponse stateId;
	private final StringResponse zipcode;

	public ContactInfoResponse() {
		super(EntityType.CONTACT_INFO);

		id = null;
		city = null;
		country = null;
		countryId = null;
		name = null;
		nameFirst = null;
		nameLast = null;
		state = null;
		stateId = null;
		zipcode = null;
	}

	public ContactInfoResponse(IDResponse id, StringResponse city, StringResponse country, IntResponse countryId, StringResponse name, StringResponse nameFirst, StringResponse nameLast, StringResponse state, IntResponse stateId, StringResponse zipcode) {
		super(EntityType.CONTACT_INFO, true);
		this.id = id;
		this.city = city;
		this.country = country;
		this.countryId = countryId;
		this.name = name;
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		this.state = state;
		this.stateId = stateId;
		this.zipcode = zipcode;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * Participant City Name
	 *
	 * @deprecated This entire type is deprecated. Use User.location
	 */
	@Deprecated
	public StringResponse getCity() {
		checkProvided();
		return city;
	}

	/**
	 * Participant Country Name
	 *
	 * @deprecated This entire type is deprecated. Use User.location
	 */
	@Deprecated
	public StringResponse getCountry() {
		checkProvided();
		return country;
	}

	/**
	 * Participant Country (region) id
	 *
	 * @deprecated This entire type is deprecated. Use User.location
	 */
	@Deprecated
	public IntResponse getCountryId() {
		checkProvided();
		return countryId;
	}

	@Deprecated
	public StringResponse getName() {
		checkProvided();
		return name;
	}

	/**
	 * First Name
	 *
	 * @deprecated This entire type is deprecated. Use User.location
	 */
	@Deprecated
	public StringResponse getNameFirst() {
		checkProvided();
		return nameFirst;
	}

	/**
	 * Last Name
	 *
	 * @deprecated This entire type is deprecated. Use User.location
	 */
	@Deprecated
	public StringResponse getNameLast() {
		checkProvided();
		return nameLast;
	}

	/**
	 * Participant State Name
	 *
	 * @deprecated This entire type is deprecated. Use User.location
	 */
	@Deprecated
	public StringResponse getState() {
		checkProvided();
		return state;
	}

	/**
	 * Participant State (region) id
	 *
	 * @deprecated This entire type is deprecated. Use User.location
	 */
	@Deprecated
	public IntResponse getStateId() {
		checkProvided();
		return stateId;
	}

	/**
	 * Zip or Postal Code
	 *
	 * @deprecated This entire type is deprecated. Use User.location
	 */
	@Deprecated
	public StringResponse getZipcode() {
		checkProvided();
		return zipcode;
	}
}
