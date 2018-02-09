# Team Walking in a Weiner Wongerland
<ul>
	<li> (Larry Wong, Joshua Weiner, Eric Wong)</li>
 	<li> APCS2 pd8</li>
 	<li>L00 -- But What Does the Data Say?</li>
	<li>2018-02-09</li>
</ul>
<p align="center">
<b>Determining The Run Time of Matrix Search Algorithm</b>
</p>

# Hypothesis
<p> Our search algorithim will run, on average, in O(n) linear time. </P>

# Background
<p> Our goal for this lab was to create a search algorithim for a 2D array of (n*n size) that would find
a target value in O(n) time. Here is a visual representation </p>

# Experiment Methodology
<ol>
	<li>  <p> Step 1: Populate a new 2D array of size*size elements (each element increments from 0 to size^2), size being an integer starting from 1000.</p> </li>
	<li>  <p> Step 2: Start timer. Run our search algorithim, which can be found <a href = https://github.com/LarWong/WalkingInAWeinerWongerland/blob/master/flowchart.pdf> here. </a> The timer will time, in nanoseconds, the amount of time the each search takes, of which we will do 10000 trials. After 10000, average the amount of time it took for each trial. </p> </li>
	<li>  <p> Step 3: Increment size by 100 and repeat Steps 1 and 2. Keep repeating until size reaches 10000. This ensures that we will be testing arrays of each size from 1000-10000 (incremented by 100) and each sized array tested 10000 times. </p> </li>

</ol>

# Results
<h2 align="center"> Graph </h2>
    <img src="https://github.com/LarWong/WalkingInAWeinerWongerland/blob/master/graph.png" >
<h3> Observations </h3>
<p> This graph appears to have a linear trend. this would agree with our hypothesis, which was that our experiment ran in O(n) linear time. </p>
<p> The graph shows the average runtime (10,000 trials) of each size (1000-10000;increments of 100) to ensure the most accurate and precise results. </p>

# Conclusions
<ul>
	<li> Analysis </li>
	     <ul>
		<li> <p>Our code runs in linear time.</p> </li>
		<li> <p>The data seems to change in increments - the change in runtime between each size increment of 100 is relatively constant.</p> </li>
	     </ul>
	<li> Unresolved Issues </li>
	     <ul>
		<li> <p> There are sometimes random spikes (outliers) for random sizes in the data, which is strange, since the average of 10,000 trials should not return any outliers. </p> </li>
	     </ul>
</ul>

