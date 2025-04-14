#### Recursion Examples:

inPlace array index swap - reverses list - first and last index of array passes in to elements pos1 and pos2 respectively

public static coid inPlace(int[] array, int pos1, int pos2) {
  if (pos2 <= pos1>) return;
  int tmp = array[pos1];
  array[pos1] = array[pos2];
  array[pos2] = tmp;
  inPlace(array, ++pos1, --pos2);
}


