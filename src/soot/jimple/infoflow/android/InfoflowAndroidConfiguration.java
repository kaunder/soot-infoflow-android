package soot.jimple.infoflow.android;

import soot.jimple.infoflow.InfoflowConfiguration;
import soot.jimple.infoflow.android.source.AndroidSourceSinkManager.LayoutMatchingMode;
import soot.jimple.infoflow.data.pathBuilders.DefaultPathBuilderFactory.PathBuilder;

/**
 * Configuration class for the Android-specific data flow analysis
 * 
 * @author Steven Arzt
 *
 */
public class InfoflowAndroidConfiguration extends InfoflowConfiguration {

	private boolean computeResultPaths = true;
	private PathBuilder pathBuilder = PathBuilder.ContextInsensitiveSourceFinder;
	
	private boolean enableCallbacks = true;
	private boolean enableCallbackSources = true;
	
	private LayoutMatchingMode layoutMatchingMode = LayoutMatchingMode.MatchSensitiveOnly;
	
	/**
	 * Sets the algorithm to be used for reconstructing the paths between sources and sinks
	 * 
	 * @param builder
	 *            The path reconstruction algorithm to be used
	 */
	public void setPathBuilder(PathBuilder builder) {
		this.pathBuilder = builder;
	}
	
	/**
	 * Gets the algorithm to be used for reconstructing the paths between sources and sinks
	 * 
	 * @return The path reconstruction algorithm to be used
	 */
	public PathBuilder getPathBuilder() {
		return this.pathBuilder;
	}

	/**
	 * Sets whether the exact paths between source and sink shall be computed. If this feature is disabled, only the
	 * source-and-sink pairs are reported. This option only applies if the selected path reconstruction algorithm
	 * supports path computations.
	 * 
	 * @param computeResultPaths
	 *            True if the exact propagation paths shall be computed, otherwise false
	 */
	public void setComputeResultPaths(boolean computeResultPaths) {
		this.computeResultPaths = computeResultPaths;
	}
	
	/**
	 * Gets whether the exact paths between source and sink shall be computed. If this feature is disabled, only the
	 * source-and-sink pairs are reported. This option only applies if the selected path reconstruction algorithm
	 * supports path computations.
	 * 
	 * @return True if the exact propagation paths shall be computed, otherwise false
	 */
	public boolean getComputeResultPaths() {
		return this.computeResultPaths;
	}
	
	/**
	 * Sets whether the taint analysis shall consider callbacks
	 * 
	 * @param enableCallbacks
	 *            True if taints shall be tracked through callbacks, otherwise false
	 */
	public void setEnableCallbacks(boolean enableCallbacks) {
		this.enableCallbacks = enableCallbacks;
	}
	
	/**
	 * Gets whether the taint analysis shall consider callbacks
	 * 
	 * @return True if taints shall be tracked through callbacks, otherwise false
	 */
	public boolean getEnableCallbacks() {
		return this.enableCallbacks;
	}
	
	/**
	 * Sets whether the taint analysis shall consider callback as sources
	 * 
	 * @param enableCallbackSources
	 *            True if setting callbacks as sources
	 */
	public void setEnableCallbackSources(boolean enableCallbackSources) {
		this.enableCallbackSources = enableCallbackSources;
	}
	
	/**
	 * Gets whether the taint analysis shall consider callback as sources
	 * 
	 * @return True if setting callbacks as sources
	 */
	public boolean getEnableCallbackSources() {
		return this.enableCallbackSources;
	}
	
	/**
	 * Sets the mode to be used when deciding whether a UI control is a source or not
	 * 
	 * @param mode
	 *            The mode to be used for classifying UI controls as sources
	 */
	public void setLayoutMatchingMode(LayoutMatchingMode mode) {
		this.layoutMatchingMode = mode;
	}

	/**
	 * Gets the mode to be used when deciding whether a UI control is a source or not
	 * 
	 * @return The mode to be used for classifying UI controls as sources
	 */
	public LayoutMatchingMode getLayoutMatchingMode() {
		return this.layoutMatchingMode;
	}

}
