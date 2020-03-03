package com.github.gpluscb.ggjava.entity.object.response;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.internal.utils.Checks;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListResponse<E extends AbstractGGResponseObject> extends AbstractGGResponseObject implements List<E> {
	private final List<E> value;

	public ListResponse(@Nonnull EntityType type) {
		super(type);

		value = null;
	}

	public ListResponse(@Nonnull EntityType type, @Nonnull List<E> value) {
		super(type, true);
		Checks.nonNull(value, "value");
		// Only allow provided elements in
		value.forEach(e -> {
			if (e != null) e.checkProvided();
		});
		this.value = value;
	}

	@Override
	public int size() {
		checkProvided();
		return value.size();
	}

	@Override
	public boolean isEmpty() {
		checkProvided();
		return value.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		checkProvided();
		return value.contains(o);
	}

	@Nonnull
	@Override
	public Iterator<E> iterator() {
		checkProvided();
		return value.iterator();
	}

	@Nonnull
	@Override
	public Object[] toArray() {
		checkProvided();
		return value.toArray();
	}

	@Nonnull
	@Override
	public <T> T[] toArray(@Nonnull T[] ts) {
		checkProvided();
		return value.toArray(ts);
	}

	@Override
	public boolean add(E e) {
		checkProvided();
		// Only allow provided elements in
		if (e != null) e.checkProvided();
		return value.add(e);
	}

	@Override
	public boolean remove(Object o) {
		checkProvided();
		return value.remove(o);
	}

	@Override
	public boolean containsAll(@Nonnull Collection<?> collection) {
		checkProvided();
		return value.containsAll(collection);
	}

	@Override
	public boolean addAll(@Nonnull Collection<? extends E> collection) {
		checkProvided();
		// Only allow provided elements in
		collection.forEach(e -> {
			if (e != null) e.checkProvided();
		});
		return value.addAll(collection);
	}

	@Override
	public boolean addAll(int i, @Nonnull Collection<? extends E> collection) {
		checkProvided();
		// Only allow provided elements in
		collection.forEach(e -> {
			if (e != null) e.checkProvided();
		});
		return value.addAll(i, collection);
	}

	@Override
	public boolean removeAll(@Nonnull Collection<?> collection) {
		checkProvided();
		return value.removeAll(collection);
	}

	@Override
	public boolean retainAll(@Nonnull Collection<?> collection) {
		checkProvided();
		return value.retainAll(collection);
	}

	@Override
	public void clear() {
		checkProvided();
		value.clear();
	}

	@Override
	public E get(int i) {
		checkProvided();
		return value.get(i);
	}

	@Override
	public E set(int i, E e) {
		checkProvided();
		// Only allow provided elements in
		if (e != null) e.checkProvided();
		return value.set(i, e);
	}

	@Override
	public void add(int i, E e) {
		checkProvided();
		// Only allow provided elements in
		if (e != null) e.checkProvided();
		value.add(i, e);
	}

	@Override
	public E remove(int i) {
		checkProvided();
		return value.remove(i);
	}

	@Override
	public int indexOf(Object o) {
		checkProvided();
		return value.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		checkProvided();
		return value.lastIndexOf(o);
	}

	@Nonnull
	@Override
	public ListIterator<E> listIterator() {
		checkProvided();
		return value.listIterator();
	}

	@Nonnull
	@Override
	public ListIterator<E> listIterator(int i) {
		checkProvided();
		return value.listIterator(i);
	}

	@Nonnull
	@Override
	public List<E> subList(int i, int i1) {
		checkProvided();
		return value.subList(i, i1);
	}
}
