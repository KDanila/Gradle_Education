plugins {
	id("base")
}

tasks.create<Zip>("zip"){
	description = "Archives sources in a zip file"
	group = "Archive"

	from("src")
	setArchiveName("project-init-1.0.zip")
}

tasks.create<Copy>("copy"){
	description = "Copies sources to the dest directory"
	group = "Custom"

	from("src")
	into("dest")
}