multibranchPipelineJob('bento Open Cabinet') {
    branchSources {
        git {
            remote('https://github.com/excellaco/open-cabinet.git')
            includes('*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
