interface BankActions {

    /**
     * Opens a new Account in the bank
     * @param name - the name of the new account
     * @return - boolean indicating if the new account was succesfully created
     */
    public abstract boolean openAccount(String name);

    /**
     * Add a BankAccount to the Bank
     * @param account to add to the bank
     * @return boolean indicating if successfully added
     */
    public abstract boolean addAccount(BankAccount account);

    /**
     * Search for a BankAccount based on the name
     * 
     * @param name of the account to find
     * @return the BankAccount that is being searched for
     */
    public abstract BankAccount findByName(String name);


    /**
     * Get the balance of an account
     * @param name - the name of the account to get the balance of
     * @return the balance of the account (double)
     */
    public abstract double getBalance(String name);

    /**
     * Check if the Bank contains an account based on the name
     * @param name - the name of the account to search for
     * @return boolean indicating if the Bank has an account with that name
     */
    public abstract boolean contains(String name);
} 