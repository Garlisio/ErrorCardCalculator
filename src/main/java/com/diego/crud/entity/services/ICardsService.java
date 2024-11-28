package com.diego.crud.entity.services;

import java.util.List;

import com.diego.crud.entity.models.Card;


public interface ICardsService {
	public Card get(int id);
	public List<Card> getAll();
	public void post(Card product);
	public void put(Card product, int id);
	public void delete(int id);
}
