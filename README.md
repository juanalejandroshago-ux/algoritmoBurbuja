# Práctica: Algoritmo de Ordenamiento Burbuja

## Descripción
Proyecto en Java que compara el rendimiento entre el algoritmo de **Burbuja Normal** y **Burbuja Mejorada (Optimizada)**.

## Estructura del Código
- `ordenamientoBurbuja`: Implementación tradicional $O(n^2)$.
- `ordenamientoBurbujaMejorado`: Implementación optimizada con variable booleana (`huboIntercambio`) para detener el ciclo tempranamente si el arreglo ya está ordenado.

## Resultados de Ejecución
En arreglos ya ordenados, la versión mejorada reduce significativamente el número de pasadas necesarias.