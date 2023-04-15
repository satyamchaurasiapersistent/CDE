package greedy;

public class Solution
{
    //Total no of persons
    static final int n = 3;

    //Returns the index of minimum value in arr[]
    static int get_min(int arr[])
    {
        int in = 0;
        for (int i = 1; i < n; i++)
            if (arr[i] < arr[in])
                in = i;
        return in;
    }

    //Returns the maximum index in arr[]
    static int get_max(int arr[])
    {
        int in = 0;
        for (int i = 1; i < n; i++)
            if (arr[i] > arr[in])
                in = i;
        return in;
    }

    //Function which return the minimum of 2 values
    static int min_two(int x, int y)
    {
        return (x < y) ? x: y;
    }


//Here amount array is storing the net amount to be settled
//to/from person p(i), now if amount[p] is +ve then ith person
//give amount[i] otherwise amount[p] will give -amount[i].

    static void min_cashRec(int amount[])
    {
// Find the indexes of minimum and
// maximum values in amount[]
// amount[max_credit] indicates the maximum amount
// that to be given to the person.
// And amount[max_debit] indicates the maximum amount
// to be taken from a person.
//Along with the positive value there will also be negative value
        int max_credit = get_max(amount), max_debit = get_min(amount);

//amounts to be 0 for the settlement
        if (amount[max_credit] == 0 && amount[max_debit] == 0)
            return;

// Find the minimum of two amounts
        int min = min_two(-amount[max_debit], amount[max_credit]);
        amount[max_credit] -= min;
        amount[max_debit] += min;

// If the minimum is the maximum amount to be
        System.out.println("Person " + max_debit + " pays " + min
                + " to " + "Person " + max_credit);

//recur for remaining persons
        min_cashRec(amount);
    }

    // Given a set of persons as graph[]
// where graph[i][j] indicates
// the amount that person i needs to
// pay person j, this function
//finds and settles the debts.
    static void min_cash(int graph[][])
    {
// Create an array amount[],
// initialize all value in it as 0 for storing
//the net amount.
        int amount[]=new int[n];

// Calculate the net amount to
// be paid to person 's', and
// stores it in amount[s]. The
// value of amount[s] an be
//calculated by subtracting
//sum of all received money - sum of all sent money.

        for (int s = 0; s < n; s++)
            for (int i = 0; i < n; i++)
                amount[s] += (graph[i][s] - graph[s][i]);

        min_cashRec(amount);
    }

    // Main function
    public static void main (String[] args)
    {
// cash[i][j] means that the amount
//person i has to pay to person j.
        int cash[][] = { {0, 2000, 4000},
                {0, 0, 3000},
                {0, 0, 0},};

// Print the solution
        min_cash(cash);
    }
}