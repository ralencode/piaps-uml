import java.util.Date;

public class Project {

	public String name;
	public Date start;
	public Date end;
	public int hours;

	public int getProjectCompleteANumberOfHours() {
		// TODO - implement Project.getProjectCompleteANumberOfHours
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return this.start;
	}

	/**
	 * 
	 * @param start
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return this.end;
	}

	/**
	 * 
	 * @param end
	 */
	public void setEnd(Date end) {
		this.end = end;
	}

	public int getHours() {
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

}