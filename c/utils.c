/**
 * This will swap two pointers around
 * @param c Pointer to the first data to be swapped
 * @param d Pointer to the second data to be swapped
 */
void swap(int *c, int *d)
{
    int temp = *c;
    *c = *d;
    *d = temp;
}
