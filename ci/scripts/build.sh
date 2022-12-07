#!/bin/sh
set -e

repository=$(pwd)/distribution-repository

cd git-repo
	./mvnw clean deploy -Dfull -DaltDeploymentRepository=distribution::default::file://${repository}
cd ..