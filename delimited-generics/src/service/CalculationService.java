package service;

import java.util.List;

public class CalculationService {
	
	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			// compareTo é usado para comparar dois itens (item e max)
			// se o resultado da comparação for maior que 0
			// significa que ITEM é maior que MAX
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}
