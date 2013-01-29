package com.zkdemo.databaseServices;
import java.util.List;

// Interface that provides 
// basic database entity methods.
public interface IDatabaseService<T> {	
	
	/* Methods */
	/* ------- */
	
	// Add new item.
	void Add(T newItem);
	
	// Remove item.
	void Remove(T item);
	
	// Remove item on given position.
	void Remove(Integer index);
	
	// Remove all items.
	void RemoveAll();

	// Get all items.
	List<T> GetAll();		
}