/** 
 * @author Chris Murphy
 *
 * This interface defines methods for getting information about a charitable fund.
 * 
 * You do not need to implement these methods; you only need it so that DonationManager will compile.
 */

public interface FundManager {
	
	public boolean isValidFund(String name);
	
	public double getFundTarget(String name);
	
	public double getFundBalance(String name);

}
